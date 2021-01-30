/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spanner.connection;

import com.google.cloud.NoCredentials;
import com.google.cloud.spanner.NonParallelUnitTest;
import com.google.cloud.spanner.connection.AbstractSqlScriptVerifier.GenericConnection;
import com.google.cloud.spanner.connection.AbstractSqlScriptVerifier.GenericConnectionProvider;
import com.google.cloud.spanner.connection.SqlScriptVerifier.SpannerGenericConnection;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
@Category(NonParallelUnitTest.class)
public class SetReadOnlyStalenessSqlScriptTest {

  static class TestConnectionProvider implements GenericConnectionProvider {
    @Override
    public GenericConnection getConnection() {
      return SpannerGenericConnection.of(
          ConnectionImplTest.createConnection(
              ConnectionOptions.newBuilder()
                  .setCredentials(NoCredentials.getInstance())
                  .setUri(ConnectionImplTest.URI)
                  .build()));
    }
  }

  @Test
  public void testSetReadOnlyStalenessScript() throws Exception {
    SqlScriptVerifier verifier = new SqlScriptVerifier(new TestConnectionProvider());
    verifier.verifyStatementsInFile("SetReadOnlyStalenessTest.sql", getClass());
  }
}
