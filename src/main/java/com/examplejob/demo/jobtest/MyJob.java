package com.examplejob.demo.jobtest;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import org.springframework.stereotype.Component;

@ElasticSimpleJob()
@Component
public class MyJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        switch (shardingContext.getShardingItem()) {
            case 0:

                break;
            case 1:

                break;
            case 2:

                break;
        }

    }

}
