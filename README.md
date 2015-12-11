# Name Generator
Generates names from notable scientists and hackers.

> Ported from Docker:
[names-generator.go](https://github.com/docker/docker/blob/master/pkg/namesgenerator/names-generator.go) <br>
Docker license:  [Apache v 2.0](https://github.com/dotcloud/docker/blob/master/LICENSE)

## Usage

Calling the NameGenerator Object without any parameters requests a random name. All names called this way use a shared instance of Random, meaning the chance of a collision is fairly small.

***Note:*** It is not impossible for the algorithm to produce the same name, we recommend verifying that the name is unique before using it.

```Scala
val pd: String = NameGenerator() //pedantic_dijkstra
val ee: String = NameGenerator() //evil_euler
val cw: String = NameGenerator() //clever_wozniak
```


### Non-Random Usage

We have added the ability to specify a seed for the generator to that you may construct tests around a particular name. You may pass in either an Int or Random for the seed.

```Scala
println(NameGenerator(1000))                //distracted_kowalevski
println(NameGenerator(new Random(1000)))    //distracted_kowalevski
```

# License
Our license: [MIT](LICENSE)

Copyright (c) 2015 Thirdship
