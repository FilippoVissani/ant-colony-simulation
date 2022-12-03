package io.github.filippovissani.acs

import io.github.filippovissani.acs.contracts.controller.ControllerModule
import io.github.filippovissani.acs.contracts.view.InputModule
import io.github.filippovissani.acs.contracts.model.ModelModule
import io.github.filippovissani.acs.contracts.view.OutputModule
import io.github.filippovissani.acs.implementations.controller.ControllerModuleFactory
import io.github.filippovissani.acs.implementations.model.ModelModuleFactory
import io.github.filippovissani.acs.implementations.view.InputModuleFactory
import io.github.filippovissani.acs.implementations.view.OutputModuleFactory

interface ComponentRegistry :
    ModelModule.Component,
    ControllerModule.Component,
    OutputModule.Component,
    InputModule.Component


object App : ComponentRegistry {
    override val model: ModelModule.Model = ModelModuleFactory.create(SimulationConfig.DELTA_TIME, SimulationConfig.initialState)
    override val controller: ControllerModule.Controller = ControllerModuleFactory.create(this)
    override val output: OutputModule.Output = OutputModuleFactory.create()
    override val input: InputModule.Input = InputModuleFactory.create(this)
}

fun main(){
    App
}