package org.apache.sqoop.importjob.numerictypes;

import org.apache.sqoop.importjob.configuration.MysqlImportJobTestConfiguration;
import org.apache.sqoop.testcategories.thirdpartytest.MysqlTest;
import org.apache.sqoop.testutil.adapter.DatabaseAdapter;
import org.apache.sqoop.testutil.adapter.MysqlDatabaseAdapter;
import org.junit.experimental.categories.Category;

@Category(MysqlTest.class)
public class MysqlNumericTypesImportTest extends NumericTypesImportTestBase {

  @Override
  public DatabaseAdapter createAdapter() {
    return new MysqlDatabaseAdapter();
  }

  public MysqlNumericTypesImportTest() {
    super(new MysqlImportJobTestConfiguration(), SUCCEED_WITHOUT_EXTRA_ARGS, SUCCEED_WITH_PADDING_ONLY);
  }
}
