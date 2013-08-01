# Day One
## 2013/07/31

Got the project started.

Doing some research on application structure. I'm partial, personally to the philosophy
behind the whole [Twelve Factor App](http://12factor.net/) thing, particularly in regards
to configuration and self-hosting.

### Environ config lib
Found [Environ](https://github.com/weavejester/environ), which is a pretty neat little shim
for pulling values from configuration switches (environment, java properties, .lein-env file)
which gives me a pretty nifty little `config` namespace in the root of the code that's not 
holding onto anything real.

### Multi-methods dispatching on arbitrary meta-data.
```
(defn metadata-dispatch [instance]
  (:discriminator (meta instance)))

(defmulti mmethod metadata-dispatch)
(defmethod mmethod :foo [_] "Coming from a foo!")
(defmethod mmethod :bar [_] "Coming from a bar!")

(def one
	(with-meta {:aaa :bbb} {:discriminator :foo}))

(def two
	(with-meta {:aaa :bbb} {:discriminator :bar}))

(mmethod one)
;;; "Coming from a foo!"

(mmethod two)
;;; "Coming from a bar!"
```