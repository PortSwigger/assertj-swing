/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2018 the original author or authors.
 */
package org.assertj.swing.driver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.swing.query.ComponentVisibleQuery.isVisible;

import org.junit.Test;

/**
 * Tests for {@link WindowDriver#show(java.awt.Window)}.
 * 
 * @author Alex Ruiz
 */
public class WindowDriver_showWithSize_Test extends WindowDriver_TestCase {
  @Test
  public void should_Show_Window() {
    driver.show(window);
    assertThat(isVisible(window)).isTrue();
  }
}
