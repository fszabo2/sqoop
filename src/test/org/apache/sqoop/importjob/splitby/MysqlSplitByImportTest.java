package org.apache.sqoop.importjob.splitby;

import org.apache.sqoop.testcategories.thirdpartytest.MysqlTest;
import org.apache.sqoop.testutil.adapter.DatabaseAdapter;
import org.apache.sqoop.testutil.adapter.MysqlDatabaseAdapter;
import org.junit.experimental.categories.Category;

@Category(MysqlTest.class)
public class MysqlSplitByImportTest extends SplitByImportTestBase {

  @Override
  public DatabaseAdapter createAdapter() {
    return new MysqlDatabaseAdapter();
  }
}
