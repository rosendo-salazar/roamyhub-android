package com.roamyhub.android.feature.plans.browse.ui;

/**
 * Simple ViewModel for Global Plans screen
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/roamyhub/android/feature/plans/browse/ui/GlobalPlansViewModel;", "Landroidx/lifecycle/ViewModel;", "planRepository", "Lcom/roamyhub/android/core/domain/repository/PlanRepository;", "(Lcom/roamyhub/android/core/domain/repository/PlanRepository;)V", "getPlanRepository", "()Lcom/roamyhub/android/core/domain/repository/PlanRepository;", "plans_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class GlobalPlansViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.roamyhub.android.core.domain.repository.PlanRepository planRepository = null;
    
    @javax.inject.Inject()
    public GlobalPlansViewModel(@org.jetbrains.annotations.NotNull()
    com.roamyhub.android.core.domain.repository.PlanRepository planRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.roamyhub.android.core.domain.repository.PlanRepository getPlanRepository() {
        return null;
    }
}