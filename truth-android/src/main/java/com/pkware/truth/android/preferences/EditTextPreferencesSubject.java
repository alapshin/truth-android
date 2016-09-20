/*
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
package com.pkware.truth.android.preferences;

import android.preference.EditTextPreference;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.SubjectFactory;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link EditTextPreference} subjects.
 */
public class EditTextPreferencesSubject extends AbstractDialogPreferenceSubject<EditTextPreferencesSubject, EditTextPreference> {
  protected EditTextPreferencesSubject(FailureStrategy failureStrategy, EditTextPreference subject) {
    super(failureStrategy, subject);
  }

  public static SubjectFactory<EditTextPreferencesSubject, EditTextPreference> type() {
    return new SubjectFactory<EditTextPreferencesSubject, EditTextPreference>() {
      @Override
      public EditTextPreferencesSubject getSubject(FailureStrategy fs, EditTextPreference that) {
        return new EditTextPreferencesSubject(fs, that);
      }
    };
  }

  public EditTextPreferencesSubject hasText(String text) {
    assertThat(actual().getText())
        .named("text")
        .isEqualTo(text);
    return this;
  }
}
