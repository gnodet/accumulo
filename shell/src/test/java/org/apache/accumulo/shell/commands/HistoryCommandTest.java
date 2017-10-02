/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo.shell.commands;

public class HistoryCommandTest {

  //  HistoryCommand command;
  //  CommandLine cl;
  //
  //  ByteArrayOutputStream baos;
  //  LineReader reader;
  //  Shell shell;
  //
  //  @Before
  //  public void setUp() throws Exception {
  //    command = new HistoryCommand();
  //    command.getOptions(); // Make sure everything is initialized
  //
  //    cl = createMock(CommandLine.class);
  //    expect(cl.hasOption("c")).andReturn(false);
  //    expect(cl.hasOption("np")).andReturn(true);
  //    replay(cl);
  //
  //    History history = new MemoryHistory();
  //    history.add("foo");
  //    history.add("bar");
  //
  //    baos = new ByteArrayOutputStream();
  //
  //    String input = String.format("!1%n"); // Construct a platform dependent new-line
  //    reader = new ConsoleReader(new ByteArrayInputStream(input.getBytes()), baos);
  //    reader.setHistory(history);
  //
  //    shell = new Shell(reader);
  //  }
  //
  //  @Test
  //  public void testCorrectNumbering() throws IOException {
  //    command.execute("", cl, shell);
  //    reader.flush();
  //
  //    assertTrue(baos.toString().contains("2: bar"));
  //  }
  //
  //  @Test
  //  public void testEventExpansion() throws IOException {
  //    // If we use an unsupported terminal, then history expansion doesn't work because JLine can't do magic buffer manipulations.
  //    // This has been observed to be the case on certain versions of Eclipse. However, mvn is usually fine.
  //    Assume.assumeTrue(reader.getTerminal().isSupported());
  //
  //    reader.readLine();
  //
  //    assertTrue(baos.toString().trim().endsWith("foo"));
  //  }

}
