import { Interfaces } from '../identifiers';

export default function getExperimentCondition(experimentConditionData: any, experimentPoint: string, partitionId?: string): Interfaces.IGetExperimentCondition {
  try {
    if (experimentConditionData) {
      const result = experimentConditionData.filter(data =>
        partitionId ? (data.name === partitionId && data.point === experimentPoint) : (data.point === experimentPoint && !data.name)
      );

      return result.length ? result[0] : null;
    } else {
      return null;
    }
  } catch (error) {
    throw new Error(error);
  }
}
