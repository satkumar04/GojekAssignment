// Generated by Dagger (https://google.github.io/dagger).
package com.example.assignment.di.module;

import com.example.assignment.model.database.AppDatabase;
import com.example.assignment.model.database.dao.RepoDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DataBaseModule_ProvideUserDaoFactory implements Factory<RepoDao> {
  private final DataBaseModule module;

  private final Provider<AppDatabase> appDataBaseProvider;

  public DataBaseModule_ProvideUserDaoFactory(DataBaseModule module,
      Provider<AppDatabase> appDataBaseProvider) {
    this.module = module;
    this.appDataBaseProvider = appDataBaseProvider;
  }

  @Override
  public RepoDao get() {
    return provideUserDao(module, appDataBaseProvider.get());
  }

  public static DataBaseModule_ProvideUserDaoFactory create(DataBaseModule module,
      Provider<AppDatabase> appDataBaseProvider) {
    return new DataBaseModule_ProvideUserDaoFactory(module, appDataBaseProvider);
  }

  public static RepoDao provideUserDao(DataBaseModule instance, AppDatabase appDataBase) {
    return Preconditions.checkNotNull(instance.provideUserDao(appDataBase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
