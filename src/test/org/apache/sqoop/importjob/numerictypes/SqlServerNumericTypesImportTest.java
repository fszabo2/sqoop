package org.apache.sqoop.importjob.numerictypes;

import org.apache.sqoop.importjob.configuration.SqlServerImportJobTestConfiguration;
import org.apache.sqoop.testcategories.thirdpartytest.SqlServerTest;
import org.apache.sqoop.testutil.adapter.DatabaseAdapter;
import org.apache.sqoop.testutil.adapter.SqlServerDatabaseAdapter;
import org.junit.experimental.categories.Category;

@Category(SqlServerTest.class)
public class SqlServerNumericTypesImportTest extends NumericTypesImportTestBase {

  @Override
  public DatabaseAdapter createAdapter() {
    return new SqlServerDatabaseAdapter();
  }

  public SqlServerNumericTypesImportTest() {
    super(new SqlServerImportJobTestConfiguration(), SUCCEED_WITHOUT_EXTRA_ARGS, SUCCEED_WITH_PADDING_ONLY);
  }
}
