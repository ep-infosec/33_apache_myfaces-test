/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.myfaces.test.mock;

import java.io.Serializable;

/**
 * <p>Test JavaBean for testing mock objects themselves.</p>
 *
 * $Id$
 */
public class MockBean implements Serializable
{

    private static final long serialVersionUID = 8879968751506858610L;
    private String command;

    public String getCommand()
    {
        return (this.command);
    }

    public void setCommand(String command)
    {
        this.command = command;
    }

    private String input;

    public String getInput()
    {
        return (this.input);
    }

    public void setInput(String input)
    {
        this.input = input;
    }

    private String output;

    public String getOutput()
    {
        return (this.output);
    }

    public void setOutput(String output)
    {
        this.output = output;
    }

    public String combine()
    {
        return ((command == null ? "" : command) + ":"
                + (input == null ? "" : input) + ":" + (output == null ? ""
                : output));
    }

}
