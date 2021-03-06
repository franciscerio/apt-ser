package io.github.bonarmada.apt_ser.di.component

import dagger.Component
import io.github.bonarmada.apt_ser.di.module.*
import io.github.bonarmada.apt_ser.view.ui.main.MainActivity
import io.github.bonarmada.apt_ser.di.scope.AppScope
import io.github.bonarmada.apt_ser.ui.detail.DetailActivity


@AppScope
@Component(modules = [AppModule::class, RemoteModule::class, NetworkModule::class, ViewModelModule::class, RoomModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: DetailActivity)
}