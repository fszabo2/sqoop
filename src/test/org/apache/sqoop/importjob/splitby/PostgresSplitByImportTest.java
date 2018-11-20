package org.apache.sqoop.importjob.splitby;

import org.apache.sqoop.testcategories.thirdpartytest.PostgresqlTest;
import org.apache.sqoop.testutil.adapter.DatabaseAdapter;
import org.apache.sqoop.testutil.adapter.PostgresDatabaseAdapter;
import org.junit.experimental.categories.Category;

@Category(PostgresqlTest.class)
public class PostgresSplitByImportTest extends SplitByImportTestBase {

  @Override
  public DatabaseAdapter createAdapter() {
    return new PostgresDatabaseAdapter();
  }
}
