# todoclj

This is a tutorial todo web application, written in clojure and clojurescript.

You can follow along with my thoughts as I build this and discover interesting
things about clojure by reading the [Development Journal][3].


## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.


## Running

First, make sure the values in the [config][4] have values in the environment, or
in a `.lein-env` file in the root of the project. For example:

```
{
	:database-url "mysql://localhost:3306/todoclj"
	:database-user "user"
	:database-password "password"
}
```

To start a web server for the application, run:

    lein ring server

To start an interactive repl for the application, run:

	lein repl


## License

Copyright (c) 2013 Jonathan Raphaelson

This project is licensed under the [MIT License][2], meaning you're free to do pretty much whatever, so long as you attribute this project. Also, you can't sue me.


## 🐓

[1]: https://github.com/technomancy/leiningen
[2]: ./LICENSE.md
[3]: ./JOURNAL.md
