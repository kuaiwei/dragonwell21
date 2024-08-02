/*
 * Copyright (c) 2021, 2023, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.openjdk.bench.java.lang.foreign;

import java.lang.foreign.MemorySegment;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

import java.util.concurrent.TimeUnit;

import static org.openjdk.bench.java.lang.foreign.CallOverheadHelper.*;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 5, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@State(org.openjdk.jmh.annotations.Scope.Thread)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(value = 3, jvmArgsAppend = { "--enable-native-access=ALL-UNNAMED", "--enable-preview" })
public class CallOverheadReg {
    int[] val = new int[32];

    @Benchmark
    public int jni_identity_live8() throws Throwable {
      int lf0=val[0] * 2;
      int lf1=val[1] * 2;
      int lf2=val[2] * 2;
      int lf3=val[3] * 2;
      int lf4=val[4] * 2;
      int lf5=val[5] * 2;
      int lf6=val[6] * 2;
      int lf7=val[7] * 2;
      return identity(10) + lf0+lf1+lf2+lf3+lf4+lf5+lf6+lf7;
    }

    @Benchmark
    public int jni_identity_live16() throws Throwable {
      int lf0=val[0] * 2;
      int lf1=val[1] * 2;
      int lf2=val[2] * 2;
      int lf3=val[3] * 2;
      int lf4=val[4] * 2;
      int lf5=val[5] * 2;
      int lf6=val[6] * 2;
      int lf7=val[7] * 2;
      int lf8=val[8] * 2;
      int lf9=val[9] * 2;
      int lf10=val[10] * 2;
      int lf11=val[11] * 2;
      int lf12=val[12] * 2;
      int lf13=val[13] * 2;
      int lf14=val[14] * 2;
      int lf15=val[15] * 2;
      return identity(10) + lf0+lf1+lf2+lf3+lf4+lf5+lf6+lf7+lf8+lf9+lf10+lf11+lf12+lf13+lf14+lf15;
    }

    @Benchmark
    public int jni_identity_live32() throws Throwable {
      int lf0=val[0] * 2;
      int lf1=val[1] * 2;
      int lf2=val[2] * 2;
      int lf3=val[3] * 2;
      int lf4=val[4] * 2;
      int lf5=val[5] * 2;
      int lf6=val[6] * 2;
      int lf7=val[7] * 2;
      int lf8=val[8] * 2;
      int lf9=val[9] * 2;
      int lf10=val[10] * 2;
      int lf11=val[11] * 2;
      int lf12=val[12] * 2;
      int lf13=val[13] * 2;
      int lf14=val[14] * 2;
      int lf15=val[15] * 2;
      int lf16=val[16] * 2;
      int lf17=val[17] * 2;
      int lf18=val[18] * 2;
      int lf19=val[19] * 2;
      int lf20=val[20] * 2;
      int lf21=val[21] * 2;
      int lf22=val[22] * 2;
      int lf23=val[23] * 2;
      int lf24=val[24] * 2;
      int lf25=val[25] * 2;
      int lf26=val[26] * 2;
      int lf27=val[27] * 2;
      int lf28=val[28] * 2;
      int lf29=val[29] * 2;
      int lf30=val[30] * 2;
      int lf31=val[31] * 2;

      return identity(10) + lf0+lf1+lf2+lf3+lf4+lf5+lf6+lf7+lf8+lf9+lf10+lf11+lf12+lf13+lf14+lf15+lf16+lf17+lf18+lf19+lf20+lf21+lf22+lf23+lf24+lf25+lf26+lf27+lf28+lf29+lf30+lf31;
    }

    @Benchmark
    public int panama_identity_live8() throws Throwable {
      int lf0=val[0] * 2;
      int lf1=val[1] * 2;
      int lf2=val[2] * 2;
      int lf3=val[3] * 2;
      int lf4=val[4] * 2;
      int lf5=val[5] * 2;
      int lf6=val[6] * 2;
      int lf7=val[7] * 2;

      return (int)identity.invokeExact(10) + lf0+lf1+lf2+lf3+lf4+lf5+lf6+lf7;
    }

    @Benchmark
    public int panama_identity_live16() throws Throwable {
      int lf0=val[0] * 2;
      int lf1=val[1] * 2;
      int lf2=val[2] * 2;
      int lf3=val[3] * 2;
      int lf4=val[4] * 2;
      int lf5=val[5] * 2;
      int lf6=val[6] * 2;
      int lf7=val[7] * 2;
      int lf8=val[8] * 2;
      int lf9=val[9] * 2;
      int lf10=val[10] * 2;
      int lf11=val[11] * 2;
      int lf12=val[12] * 2;
      int lf13=val[13] * 2;
      int lf14=val[14] * 2;
      int lf15=val[15] * 2;

      return (int)identity.invokeExact(10) + lf0+lf1+lf2+lf3+lf4+lf5+lf6+lf7+lf8+lf9+lf10+lf11+lf12+lf13+lf14+lf15;
    }

    @Benchmark
    public int panama_identity_live32() throws Throwable {
      int lf0=val[0] * 2;
      int lf1=val[1] * 2;
      int lf2=val[2] * 2;
      int lf3=val[3] * 2;
      int lf4=val[4] * 2;
      int lf5=val[5] * 2;
      int lf6=val[6] * 2;
      int lf7=val[7] * 2;
      int lf8=val[8] * 2;
      int lf9=val[9] * 2;
      int lf10=val[10] * 2;
      int lf11=val[11] * 2;
      int lf12=val[12] * 2;
      int lf13=val[13] * 2;
      int lf14=val[14] * 2;
      int lf15=val[15] * 2;
      int lf16=val[16] * 2;
      int lf17=val[17] * 2;
      int lf18=val[18] * 2;
      int lf19=val[19] * 2;
      int lf20=val[20] * 2;
      int lf21=val[21] * 2;
      int lf22=val[22] * 2;
      int lf23=val[23] * 2;
      int lf24=val[24] * 2;
      int lf25=val[25] * 2;
      int lf26=val[26] * 2;
      int lf27=val[27] * 2;
      int lf28=val[28] * 2;
      int lf29=val[29] * 2;
      int lf30=val[30] * 2;
      int lf31=val[31] * 2;

      return (int)identity.invokeExact(10) + lf0+lf1+lf2+lf3+lf4+lf5+lf6+lf7+lf8+lf9+lf10+lf11+lf12+lf13+lf14+lf15+lf16+lf17+lf18+lf19+lf20+lf21+lf22+lf23+lf24+lf25+lf26+lf27+lf28+lf29+lf30+lf31;
    }

    /*
    @Benchmark
    public int panama_identity_critical_live8() throws Throwable {
      int lf0=val[0] * 2;
      int lf1=val[1] * 2;
      int lf2=val[2] * 2;
      int lf3=val[3] * 2;
      int lf4=val[4] * 2;
      int lf5=val[5] * 2;
      int lf6=val[6] * 2;
      int lf7=val[7] * 2;

      return (int)identity_critical.invokeExact(10) + lf0+lf1+lf2+lf3+lf4+lf5+lf6+lf7;
    }

    @Benchmark
    public int panama_identity_critical_live16() throws Throwable {
      int lf0=val[0] * 2;
      int lf1=val[1] * 2;
      int lf2=val[2] * 2;
      int lf3=val[3] * 2;
      int lf4=val[4] * 2;
      int lf5=val[5] * 2;
      int lf6=val[6] * 2;
      int lf7=val[7] * 2;
      int lf8=val[8] * 2;
      int lf9=val[9] * 2;
      int lf10=val[10] * 2;
      int lf11=val[11] * 2;
      int lf12=val[12] * 2;
      int lf13=val[13] * 2;
      int lf14=val[14] * 2;
      int lf15=val[15] * 2;

      return (int)identity_critical.invokeExact(10) + lf0+lf1+lf2+lf3+lf4+lf5+lf6+lf7+lf8+lf9+lf10+lf11+lf12+lf13+lf14+lf15;
    }

    @Benchmark
    public int panama_identity_critical_live32() throws Throwable {
      int lf0=val[0] * 2;
      int lf1=val[1] * 2;
      int lf2=val[2] * 2;
      int lf3=val[3] * 2;
      int lf4=val[4] * 2;
      int lf5=val[5] * 2;
      int lf6=val[6] * 2;
      int lf7=val[7] * 2;
      int lf8=val[8] * 2;
      int lf9=val[9] * 2;
      int lf10=val[10] * 2;
      int lf11=val[11] * 2;
      int lf12=val[12] * 2;
      int lf13=val[13] * 2;
      int lf14=val[14] * 2;
      int lf15=val[15] * 2;
      int lf16=val[16] * 2;
      int lf17=val[17] * 2;
      int lf18=val[18] * 2;
      int lf19=val[19] * 2;
      int lf20=val[20] * 2;
      int lf21=val[21] * 2;
      int lf22=val[22] * 2;
      int lf23=val[23] * 2;
      int lf24=val[24] * 2;
      int lf25=val[25] * 2;
      int lf26=val[26] * 2;
      int lf27=val[27] * 2;
      int lf28=val[28] * 2;
      int lf29=val[29] * 2;
      int lf30=val[30] * 2;
      int lf31=val[31] * 2;

      return (int)identity_critical.invokeExact(10) + lf0+lf1+lf2+lf3+lf4+lf5+lf6+lf7+lf8+lf9+lf10+lf11+lf12+lf13+lf14+lf15
                                                    + lf16+lf17+lf18+lf19+lf20+lf21+lf22+lf23+lf24+lf25+lf26+lf27+lf28+lf29+lf30+lf31
                                                    ;
    }
*/
}
