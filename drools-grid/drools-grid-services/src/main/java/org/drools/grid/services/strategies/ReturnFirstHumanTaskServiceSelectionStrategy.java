/*
 *  Copyright 2010 salaboy.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.drools.grid.services.strategies;

import java.util.List;
import org.drools.grid.GenericHumanTaskConnector;
import org.drools.grid.HumanTaskNodeService;
import org.drools.grid.strategies.HumanTaskSelectionStrategy;
import org.drools.grid.task.HumanTaskServiceImpl;

/**
 *
 * @author salaboy
 */
public class ReturnFirstHumanTaskServiceSelectionStrategy implements HumanTaskSelectionStrategy{
    private final int sessionId; 
    private final GenericHumanTaskConnector connector;


    public ReturnFirstHumanTaskServiceSelectionStrategy(int sessionId, GenericHumanTaskConnector connector) {
        this.sessionId = sessionId;
        this.connector = connector;

    }

    public HumanTaskNodeService getBestHumanTaskService(){
        return new HumanTaskServiceImpl(connector, 1);
    }

    public GenericHumanTaskConnector getBestHumanTask(List<GenericHumanTaskConnector> connectors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}