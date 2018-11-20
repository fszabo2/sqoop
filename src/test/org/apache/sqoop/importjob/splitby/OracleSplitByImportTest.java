package org.apache.sqoop.importjob.splitby;

import org.apache.sqoop.testcategories.thirdpartytest.OracleTest;
import org.apache.sqoop.testutil.adapter.DatabaseAdapter;
import org.apache.sqoop.testutil.adapter.OracleDatabaseAdapter;
import org.junit.experimental.categories.Category;

@Category(OracleTest.class)
public class OracleSplitByImportTest extends SplitByImportTestBase {

  @Override
  public DatabaseAdapter createAdapter() {
    return new OracleDatabaseAdapter();
  }
}
