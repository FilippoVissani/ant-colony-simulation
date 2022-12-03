package io.github.filippovissani.acs

import io.github.filippovissani.acs.contracts.ControllerModule
import io.github.filippovissani.acs.contracts.InputModule
import io.github.filippovissani.acs.contracts.ModelModule
import io.github.filippovissani.acs.contracts.OutputModule
import io.github.filippovissani.acs.implementations.*

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