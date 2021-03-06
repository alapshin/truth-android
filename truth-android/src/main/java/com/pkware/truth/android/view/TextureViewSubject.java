/*
 * Copyright 2013 Square, Inc.
 * Copyright 2016 PKWARE, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pkware.truth.android.view;

import android.view.TextureView;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.SubjectFactory;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link TextureView} subjects.
 */
public class TextureViewSubject extends AbstractViewSubject<TextureViewSubject, TextureView> {
  protected TextureViewSubject(FailureStrategy failureStrategy, TextureView subject) {
    super(failureStrategy, subject);
  }

  public static SubjectFactory<TextureViewSubject, TextureView> type() {
    return new SubjectFactory<TextureViewSubject, TextureView>() {
      @Override
      public TextureViewSubject getSubject(FailureStrategy fs, TextureView that) {
        return new TextureViewSubject(fs, that);
      }
    };
  }

  public TextureViewSubject isAvailable() {
    assertThat(actual().isAvailable())
        .named("is available")
        .isTrue();
    return this;
  }

  public TextureViewSubject isNotAvailable() {
    assertThat(actual().isAvailable())
        .named("is available")
        .isFalse();
    return this;
  }
}
