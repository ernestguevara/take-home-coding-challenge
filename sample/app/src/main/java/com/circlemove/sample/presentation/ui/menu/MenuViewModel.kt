package com.circlemove.sample.presentation.ui.menu

import androidx.lifecycle.ViewModel
import com.circlemove.sample.domain.repo.SampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MenuViewModel @Inject constructor(
    private val repository: SampleRepository,
) : ViewModel() {
    val loadValue = repository.loadValue
}