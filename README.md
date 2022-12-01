# ant-colony-simulation

[![wakatime](https://wakatime.com/badge/github/FilippoVissani/ant-colony-simulation.svg)](https://wakatime.com/badge/github/FilippoVissani/ant-colony-simulation)

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=FilippoVissani_ant-colony-simulation&metric=bugs)](https://sonarcloud.io/summary/new_code?id=FilippoVissani_ant-colony-simulation)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=FilippoVissani_ant-colony-simulation&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=FilippoVissani_ant-colony-simulation)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=FilippoVissani_ant-colony-simulation&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=FilippoVissani_ant-colony-simulation)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=FilippoVissani_ant-colony-simulation&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=FilippoVissani_ant-colony-simulation)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=FilippoVissani_ant-colony-simulation&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=FilippoVissani_ant-colony-simulation)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=FilippoVissani_ant-colony-simulation&metric=coverage)](https://sonarcloud.io/summary/new_code?id=FilippoVissani_ant-colony-simulation)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=FilippoVissani_ant-colony-simulation&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=FilippoVissani_ant-colony-simulation)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=FilippoVissani_ant-colony-simulation&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=FilippoVissani_ant-colony-simulation)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=FilippoVissani_ant-colony-simulation&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=FilippoVissani_ant-colony-simulation)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=FilippoVissani_ant-colony-simulation&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=FilippoVissani_ant-colony-simulation)

## Description

The idea comes from the observation of the exploitation of food resources by ants. In fact, the latter, even if limited to the cognitive abilities of a single ant, are collectively able to find the shortest path between a food source and the anthill.

Biologists have observed, in a series of experiments conducted since 1989, that a colony of ants, faced with a choice between two paths of unequal length leading to a food source, tended to use the shorter path.

A model that explains the behavior is as follows:

1. an ant runs more or less randomly around the colony environment
2. if it discovers a food source, it returns more or less directly to the nest, leaving a trail of pheromone in its path
3. the pheromone becomes attractive, and the ants that pass nearby will tend to follow the path more or less directly
4. returning to the nest, these ants will strengthen the path
5. if the same food source can be obtained by a shorter route, the ants will tend to follow that route
6. the short route will be increasingly strengthened, and therefore more attractive
7. the long path will eventually disappear, in fact the pheromone volatilizes
8. eventually all the ants determine and "choose" the shortest path

## Requirements

1. The simulation environment is defined in a two-dimensional Euclidean space
2. Each ant's path starts from the nest
3. If an ant finds a path to a food source, it travels along it
4. If an ant does not find a path to a food source it continues randomly
5. When an ant finds food it returns to the nest following the opposite path and releasing pheromones
6. Ants have a life cycle
7. An initial amount of food is expected, which will decrease over the course of the simulation
8. The reproductivity of ants is directly proportional to the amount of food present in the nest
9. Pheromone pathways, if not strengthened, tend to disappear
10. If the same food source can be obtained by a shorter route, the ants will tend to follow that route
11. There are obstacles in the environment that cannot be crossed