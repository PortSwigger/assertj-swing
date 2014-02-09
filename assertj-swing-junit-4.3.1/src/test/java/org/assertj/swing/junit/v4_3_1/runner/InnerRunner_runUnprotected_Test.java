/*
 * Created on Apr 24, 2009
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2009 the original author or authors.
 */
package org.assertj.swing.junit.v4_3_1.runner;

import static org.easymock.EasyMock.expectLastCall;

import org.fest.mocks.EasyMockTemplate;
import org.junit.Test;

/**
 * Tests for <code>{@link InnerRunner#runUnprotected()}</code>.
 * 
 * @author Alex Ruiz
 */
public class InnerRunner_runUnprotected_Test extends InnerRunner_TestCase {

  @Test
  public void should_call_delegate_when_running_unprotected() {
    new EasyMockTemplate(delegate, notifier) {
      @Override
      protected void expectations() {
        delegate.doRun(notifier);
        expectLastCall().once();
      }

      @Override
      protected void codeToTest() {
        runner.runUnprotected();
      }
    }.run();
  }
}