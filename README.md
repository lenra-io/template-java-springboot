# template-java-springboot
[Java Springboot](https://spring.io/projects/spring-boot) template to boostrap Lenra app

## Get Started !

### Requirements*

- [x] docker
- [x] docker-compose
- [ ] buildkit
- [x] lenra_cli

_*Unchecked value is optional_


## Ignore instructions below for now


### How to install `lenra_cli`

You need to install the Lenra CLI to start the devtools that will show your app.

To download it, you can use cargo or download the binary via the [latest github release assets](https://github.com/lenra-io/lenra_cli/releases)

From cargo you need to run the following command :

```bash
cargo install lenra_cli
```

When installed you can run the binary file

```bash
lenra --version
```

### Building and debugging your app

To build your app, you can run the `lenra build` command that will build the docker container
```bash
lenra build
```

The `lenra start` command will start all needed services to make your app ready and then open your browser so you can start debugging.

```bash
lenra start
```

When everything is fine, you can stop your app by running the `lenra stop` command. That will interrupt all current running services about your app. And delete all data from your app to be able to keep your test clean.

```bash
lenra stop
```


<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please open an issue with the tag "enhancement".
Don't forget to give the project a star if you liked it! Thanks again!generate

### Generate classes

A part of this lib is generated from the [Lenra API](https://github.com/lenra-io/api).
The class generation is made at build time:

```bash
# Load API
## With wget
wget https://github.com/lenra-io/api/releases/latest/download/load-api.sh -O - -q | bash
## With curl
curl -fsSL https://github.com/lenra-io/api/releases/latest/download/load-api.sh | bash
```


### How to run the template

Just run this command in this project to run the template app.

`./mvnw spring-boot:run`

Make sure that the port that springboot has set is 3000 and not 8080. I don't know why but sometimes it doesn't use the config and starts the app on 8080.

Then you can run the devtool, it will automatically use the app on port 3000. 
