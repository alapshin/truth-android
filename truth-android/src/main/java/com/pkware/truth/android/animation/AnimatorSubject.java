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
package com.pkware.truth.android.animation;

import android.animation.Animator;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.SubjectFactory;

/**
 * Propositions for {@link Animator} subjects.
 * <p/>
 * This class if final. To extend us {@link AbstractAnimatorSubject}.
 */
public final class AnimatorSubject extends AbstractAnimatorSubject<AnimatorSubject, Animator> {
  private AnimatorSubject(FailureStrategy failureStrategy, Animator subject) {
    super(failureStrategy, subject);
  }

  public static SubjectFactory<AnimatorSubject, Animator> type() {
    return new SubjectFactory<AnimatorSubject, Animator>() {
      @Override
      public AnimatorSubject getSubject(FailureStrategy fs, Animator that) {
        return new AnimatorSubject(fs, that);
      }
    };
  }
}
