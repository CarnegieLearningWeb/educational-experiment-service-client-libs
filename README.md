## This code has been moved to https://github.com/CarnegieLearningWeb/UpGrade.git
Under the clientlibs/ directory

# UPGRADE CLIENT SIDE SDK
# Exported Class
UpgradeClient named class is exported from this library

# Functions

## Initialize User
Two ways for initializing users
``` const upClient = UpgradeClient('userId', 'hostUrl');```
``` const upClient = UpgradeClient('userId', 'hostUrl', 'token');```

## setAltUserIds(altUserIds: string[])
Set alternative user ids for current user
``` upClient.setAltUserIds(altUserIds)```

## setGroupMembership (group: Map<string, Array<string>>)
Updates/Set the group membership of the initialized user
```upClient.setGroupMembership(group)```

## setWorkingGroup (workingGroup: Map<string, string>)
Updates/Set the working group of the initialized user
```upClient.setWorkingGroup(workingGroup)```

## getAllExperimentConditions(context: string)
Get all the experiment assignments for the initialized user
```upClient.getAllExperimentConditions(context)```

## getExperimentCondition (context: string, experimentPoint: string, partitionId?: string)
Returns the Experiment Condition for the partition and point received from the getAllExperimentConditions for the initialized user. If getAllExperimentConditions is not called before this function then it will call it internally and return the result.
```upClient.getExperimentCondition(context, experimentPoint)```
```upClient.getExperimentCondition(context, experimentPoint, partitionId)```

## markExperimentPoint (experimentPoint: string, condition:string|null, partitionId?: string)
Calls markExperimentPoint for experiment point and partitionId. It will use the user definition from initialized user
```upClient.markExperimentPoint(experimentPoint,condition)```
```upClient.markExperimentPoint(experimentPoint, condition, partitionId)```

## failedExperimentPoint(experimentPoint: string, reason: string, experimentId?: string)
Use this function to report failure with given reason
```upClient.failedExperimentPoint(experimentPoint, reason)```
```upClient.failedExperimentPoint(experimentPoint, reason, experimentId)```

## log(value: ILogInput[])
Use this function to log data
```
interface ILogMetrics {
  attributes: any;
  groupedMetrics: ILogGroupMetrics[];
}

interface ILogGroupMetrics {
  groupClass: string;
  groupKey: string;
  groupUniquifier: string;
  attributes: any;
}

interface ILogInput {
  timestamp: string;
  metrics: ILogMetrics;
}
upClient.log(value)
```

## addMetrics(metrics: Array<IGroupMetric | ISingleMetric>)
Use this function to add metrics in upgrade system

```
interface IGroupMetric {
    groupClass: string;
    allowedKeys: string[];
    attributes: Array<IGroupMetric | ISingleMetric>;
}
interface ISingleMetric {
    metric: string;
    datatype: IMetricMetaData;
    allowedValues?: Array<string | number>;
}
enum IMetricMetaData {
  CONTINUOUS = 'continuous',
  CATEGORICAL = 'categorical'
}
upClient.addMetrics(metrics)
```

## getAllFeatureFlags()
Use this function to get feature flags list
```upClient.getAllFeatureFlags()```

## getFeatureFlag(key: string)
Use this function to get feature flag matched to given key
```upClient.getFeatureFlag(key)```

# Example
[Sample Code](https://gist.github.com/JD2455/819b178bd43fc3da376eb2d6ddc55c3b "Sample Code")

