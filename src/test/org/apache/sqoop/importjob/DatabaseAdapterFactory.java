package org.apache.sqoop.importjob;

import org.apache.sqoop.testutil.adapter.DatabaseAdapter;

public interface DatabaseAdapterFactory {

  DatabaseAdapter createAdapter();
}
