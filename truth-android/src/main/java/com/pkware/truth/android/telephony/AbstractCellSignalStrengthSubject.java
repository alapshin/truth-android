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
package com.pkware.truth.android.telephony;

import android.annotation.TargetApi;
import android.telephony.CellSignalStrength;

import com.google.common.truth.FailureStrategy;
import com.google.common.truth.Subject;

import static android.os.Build.VERSION_CODES.JELLY_BEAN_MR1;
import static com.google.common.truth.Truth.assertThat;

@TargetApi(JELLY_BEAN_MR1)
public abstract class AbstractCellSignalStrengthSubject<S extends AbstractCellSignalStrengthSubject<S, T>, T extends CellSignalStrength> extends Subject<S, T> {
  protected AbstractCellSignalStrengthSubject(FailureStrategy failureStrategy, T subject) {
    super(failureStrategy, subject);
  }

  public S hasAsuLevel(int level) {
    assertThat(actual().getAsuLevel())
        .named("ASU level")
        .isEqualTo(level);
    //noinspection unchecked
    return (S) this;
  }

  public S hasDbm(int dbm) {
    assertThat(actual().getDbm())
        .named("dBm")
        .isEqualTo(dbm);
    //noinspection unchecked
    return (S) this;
  }

  public S hasLevel(int level) {
    assertThat(actual().getLevel())
        .named("level")
        .isEqualTo(level);
    //noinspection unchecked
    return (S) this;
  }
}
