package com.roamyhub.android.core.data.di;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.roamyhub.android.core.data.local.PreferencesManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class DataStoreModule_ProvidePreferencesManagerFactory implements Factory<PreferencesManager> {
  private final Provider<DataStore<Preferences>> dataStoreProvider;

  public DataStoreModule_ProvidePreferencesManagerFactory(
      Provider<DataStore<Preferences>> dataStoreProvider) {
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public PreferencesManager get() {
    return providePreferencesManager(dataStoreProvider.get());
  }

  public static DataStoreModule_ProvidePreferencesManagerFactory create(
      Provider<DataStore<Preferences>> dataStoreProvider) {
    return new DataStoreModule_ProvidePreferencesManagerFactory(dataStoreProvider);
  }

  public static PreferencesManager providePreferencesManager(DataStore<Preferences> dataStore) {
    return Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.providePreferencesManager(dataStore));
  }
}
