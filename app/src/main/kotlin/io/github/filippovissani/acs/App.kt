package io.github.filippovissani.acs

import io.github.filippovissani.acs.controller.ControllerModule
import io.github.filippovissani.acs.view.InputModule
import io.github.filippovissani.acs.model.ModelModule
import io.github.filippovissani.acs.view.OutputModule

interface ComponentRegistry :
    ModelModule.Component,
    ControllerModule.Component,
    OutputModule.Component,
    InputModule.Component


object App : ComponentRegistry {
    override val model: ModelModule.Model = ModelModule.Model.create(SimulationConfig.deltaTime, SimulationConfig.initialState)
    override val controller: ControllerModule.Controller = ControllerModule.Controller.create(this)
    override val output: OutputModule.Output = OutputModule.Output.create()
    override val input: InputModule.Input = InputModule.Input.create(this)
}

fun main(){
    App
}