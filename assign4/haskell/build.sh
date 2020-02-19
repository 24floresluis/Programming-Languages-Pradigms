cabal install tasty
cabal install tasty-hunit
cabal configure --enable-tests
cabal build
cabal test --show-details=streaming
cd src
runhaskell driver.hs
