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
package com.pkware.truth.android.support.v4.util;

import android.support.v4.util.AtomicFile;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;
import com.google.common.truth.SubjectFactory;

import java.io.File;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link AtomicFile} subjects.
 */
public class AtomicFileSubject extends Subject<AtomicFileSubject, AtomicFile> {
  protected AtomicFileSubject(FailureStrategy failureStrategy, AtomicFile subject) {
    super(failureStrategy, subject);
  }

  public static SubjectFactory<AtomicFileSubject, AtomicFile> type() {
    return new SubjectFactory<AtomicFileSubject, AtomicFile>() {
      @Override
      public AtomicFileSubject getSubject(FailureStrategy fs, AtomicFile that) {
        return new AtomicFileSubject(fs, that);
      }
    };
  }

  public AtomicFileSubject hasBaseFile(File file) {
    assertThat(actual().getBaseFile())
        .named("base file")
        .isEqualTo(file);
    return this;
  }
}
