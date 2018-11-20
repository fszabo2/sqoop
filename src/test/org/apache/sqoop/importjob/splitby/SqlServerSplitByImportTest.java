package org.apache.sqoop.importjob.splitby;

import org.apache.sqoop.testcategories.thirdpartytest.SqlServerTest;
import org.apache.sqoop.testutil.adapter.DatabaseAdapter;
import org.apache.sqoop.testutil.adapter.SqlServerDatabaseAdapter;
import org.junit.experimental.categories.Category;

@Category(SqlServerTest.class)
public class SqlServerSplitByImportTest extends SplitByImportTestBase {

  @Override
  public DatabaseAdapter createAdapter() {
    return new SqlServerDatabaseAdapter();
  }
}
