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
package org.assertj.swing.junit.ant;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Lists.newArrayList;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Tests for <code>{@link ImageHandler#decodeBase64AndSaveAsPng(String, String)}</code>.
 * 
 * @author Alex Ruiz
 */
@RunWith(Parameterized.class)
public class ImageHandler_decodeBase64AndSaveAsPng_Test extends ImageHandler_TestCase {

  private final String val;

  @Parameters
  public static Collection<Object[]> emptyOrNull() {
    return newArrayList(new Object[][] { { "" }, { null } });
  }

  public ImageHandler_decodeBase64AndSaveAsPng_Test(String val) {
    this.val = val;
  }

  @Test
  public void shouldReturnEmptyStringIfEncodedImageIsEmptyOrNullWhenDecodingAndSavingImage() {
    assertThat(ImageHandler.decodeBase64AndSaveAsPng(val, "somePath"));
  }

  @Test
  public void shouldReturnEmptyStringIfFilePathIsEmptyOrNullWhenDecodingAndSavingImage() {
    assertThat(ImageHandler.decodeBase64AndSaveAsPng("someImage", val));
  }
}
