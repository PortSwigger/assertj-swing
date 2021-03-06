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
package org.assertj.swing.util;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.newArrayList;
import static org.assertj.swing.util.OSFamily.UNIX;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Tests for {@link OSIdentifier#isSolaris()}.
 * 
 * @author Alex Ruiz
 */
@RunWith(Parameterized.class)
public class OSIdentifier_isSolaris_Test extends OSIdentifier_TestCase {
  private final String solaris;

  @Parameters
  public static Collection<Object[]> solaris() {
    return newArrayList(new Object[][] { { "sunos" }, { "SunOS" }, { "SUNOS" }, { "solaris" }, { "Solaris" },
        { "SOLARIS" } });
  }

  public OSIdentifier_isSolaris_Test(String solaris) {
    this.solaris = solaris;
  }

  @Test
  public void should_Return_Solaris_If_OS_Name_Starts_With_SunOS_Or_Solaris() {
    returnOSName(solaris);
    OSIdentifier osIdentifier = new OSIdentifier(propertyReader);
    assertThat(osIdentifier.isSolaris()).isTrue();
    assertThat(osIdentifier.isX11()).isTrue();
    assertThat(osIdentifier.isHPUX()).isFalse();
    assertThat(osIdentifier.isLinux()).isFalse();
    assertThat(osIdentifier.isMacintosh()).isFalse();
    assertThat(osIdentifier.isOSX()).isFalse();
    assertThat(osIdentifier.isWindows()).isFalse();
    assertThat(osIdentifier.isWindows9x()).isFalse();
    assertThat(osIdentifier.isWindowsXP()).isFalse();
    assertThat(osIdentifier.osFamily()).isEqualTo(UNIX);
  }
}
