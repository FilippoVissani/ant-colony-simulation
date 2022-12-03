package io.github.filippovissani.acs

import io.github.filippovissani.acs.contracts.ControllerModule
import io.github.filippovissani.acs.contracts.InputModule
import io.github.filippovissani.acs.contracts.ModelModule
import io.github.filippovissani.acs.contracts.OutputModule
import io.github.filippovissani.acs.implementations.ControllerModuleFactory
import io.github.filippovissani.acs.implementations.InputModuleFactory
import io.github.filippovissani.acs.implementations.ModelModuleFactory
import io.github.filippovissani.acs.implementations.OutputModuleFactory

interface ComponentRegistry :
    ModelModule.Component,
    ControllerModule.Component,
    OutputModule.Component,
    InputModule.Component

object App : ComponentRegistry {
    override val model: ModelModule.Model = ModelModuleFactory.create()
    override val controller: ControllerModule.Controller = ControllerModuleFactory.create(this)
    override val output: OutputModule.Output = OutputModuleFactory.create()
    override val input: InputModule.Input = InputModuleFactory.create(this)
}

fun main(){
    App
}