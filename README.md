# html5-examples

Microworld's one day HTML5 course written in Clojure using Noir.

The reference site is http://adx.dk/html5 and will be available as http://localhost:8080/html5 when noir is started up.

Normal Noir operation apply; i.e. it's possible to modify the clojure source on the fly and see the changes on the site instantly. 

## Usage

If you use cake, substitute 'lein' with 'cake' below. Everything should work fine.

```bash
lein deps
lein run
```

or 

```bash
lein deps
lein uberjar
java -jar target/html5-examples-0.1.0-SNAPSHOT-standalone.jar
```

After which the site will be available on http://localhost:8080/html5


If a REPL is needed, it's possible to start up using

```bash
lein deps
lein swank
```

The noir server has to be started up manually, in this case.

```clojure
html5-examples.server> (-main)
```


## License

Copyright (C) 2011 FIXME

Distributed under the Eclipse Public License, the same as Clojure.

