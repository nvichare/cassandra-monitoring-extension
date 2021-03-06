package com.appdynamics.extensions.cassandra;


import com.google.common.collect.Maps;
import com.singularity.ee.agent.systemagent.api.exception.TaskExecutionException;
import org.junit.Test;

import java.util.Map;

public class CassandraMonitorTest {

    public static final String CONFIG_ARG = "config-file";

    @Test
    public void testCassandraMonitorExtension () throws TaskExecutionException {
        CassandraMonitor cassandraMonitor = new CassandraMonitor();
        Map<String, String> taskArgs = Maps.newHashMap();
        taskArgs.put(CONFIG_ARG, "src/test/resources/conf/config.yml");
        cassandraMonitor.execute(taskArgs, null);
    }
}
