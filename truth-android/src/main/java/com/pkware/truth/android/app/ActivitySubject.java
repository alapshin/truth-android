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
package com.pkware.truth.android.app;

import android.app.Activity;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.SubjectFactory;

/**
 * Propositions for {@link Activity} subjects.
 * <p/>
 * This class is final. To extend use {@link AbstractActivitySubject}.
 */
public final class ActivitySubject extends AbstractActivitySubject<ActivitySubject, Activity> {
  private ActivitySubject(FailureStrategy failureStrategy, Activity subject) {
    super(failureStrategy, subject);
  }

  public static SubjectFactory<ActivitySubject, Activity> type() {
    return new SubjectFactory<ActivitySubject, Activity>() {
      @Override
      public ActivitySubject getSubject(FailureStrategy fs, Activity that) {
        return new ActivitySubject(fs, that);
      }
    };
  }
}
