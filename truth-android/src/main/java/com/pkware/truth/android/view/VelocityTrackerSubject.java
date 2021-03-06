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

import android.view.VelocityTracker;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;
import com.google.common.truth.SubjectFactory;

import static com.google.common.truth.Truth.assertThat;

/**
 * Propositions for {@link VelocityTracker} subjects.
 */
public class VelocityTrackerSubject extends Subject<VelocityTrackerSubject, VelocityTracker> {
  protected VelocityTrackerSubject(FailureStrategy failureStrategy, VelocityTracker subject) {
    super(failureStrategy, subject);
  }

  public static SubjectFactory<VelocityTrackerSubject, VelocityTracker> type() {
    return new SubjectFactory<VelocityTrackerSubject, VelocityTracker>() {
      @Override
      public VelocityTrackerSubject getSubject(FailureStrategy fs, VelocityTracker that) {
        return new VelocityTrackerSubject(fs, that);
      }
    };
  }

  public VelocityTrackerSubject hasXVelocity(float velocity, float tolerance) {
    assertThat(actual().getXVelocity())
        .named("X velocity")
        .isWithin(tolerance)
        .of(velocity);
    return this;
  }

  public VelocityTrackerSubject hasXVelocity(int id, float velocity, float tolerance) {
    assertThat(actual().getXVelocity(id))
        .named("X velocity for ID " + id)
        .isWithin(tolerance)
        .of(velocity);
    return this;
  }

  public VelocityTrackerSubject hasYVelocity(float velocity, float tolerance) {
    assertThat(actual().getYVelocity())
        .named("Y velocity")
        .isWithin(tolerance)
        .of(velocity);
    return this;
  }

  public VelocityTrackerSubject hasYVelocity(int id, float velocity, float tolerance) {
    assertThat(actual().getYVelocity(id))
        .named("Y velocity for ID " + id)
        .isWithin(tolerance)
        .of(velocity);
    return this;
  }
}
