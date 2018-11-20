package org.apache.sqoop.importjob.numerictypes;

import org.apache.sqoop.importjob.configuration.AvroTestConfiguration;
import org.apache.sqoop.importjob.configuration.ParquetTestConfiguration;
import org.apache.sqoop.importjob.configuration.PostgresqlImportJobTestConfigurationForNumeric;
import org.apache.sqoop.importjob.configuration.PostgresqlImportJobTestConfigurationPaddingShouldSucceed;
import org.apache.sqoop.testcategories.thirdpartytest.PostgresqlTest;
import org.apache.sqoop.testutil.adapter.DatabaseAdapter;
import org.apache.sqoop.testutil.adapter.PostgresDatabaseAdapter;
import org.apache.sqoop.util.BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@Category(PostgresqlTest.class)
@RunWith(Parameterized.class)
@Parameterized.UseParametersRunnerFactory(BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PostgresNumericTypesImportTest<T extends AvroTestConfiguration & ParquetTestConfiguration> extends NumericTypesImportTestBase<T> {

  @Override
  public DatabaseAdapter createAdapter() {
    return new PostgresDatabaseAdapter();
  }

  @Parameterized.Parameters(name = "Config: {0}| failWithoutExtraArgs: {1}| failWithPadding: {2}")
  public static Iterable<? extends Object> testConfigurations() {
    return Arrays.asList(
        new Object[]{new PostgresqlImportJobTestConfigurationForNumeric(), FAIL_WITHOUT_EXTRA_ARGS, FAIL_WITH_PADDING_ONLY},
        new Object[]{new PostgresqlImportJobTestConfigurationPaddingShouldSucceed(), SUCCEED_WITHOUT_EXTRA_ARGS, SUCCEED_WITH_PADDING_ONLY}
    );
  }

  public PostgresNumericTypesImportTest(T configuration, boolean failWithoutExtraArgs, boolean failWithPaddingOnly) {
    super(configuration, failWithoutExtraArgs, failWithPaddingOnly);
  }
}
