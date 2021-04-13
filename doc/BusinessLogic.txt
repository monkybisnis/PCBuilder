
Business Rules
==============

A customer starts in the BronzeState
When they receive 2000 points they move to SilverState
When they receive 5000 points they move to GoldState

State Discounts (%)
--------------------
BronzeState get no discount
SilverState gets 2% discount
GoldState gets 5% discount


Strategy Discounts (points/100)
-------------------------------
In addition there are three strategies:

NoSaleDiscountStrategy:
    No further discount
    Get 1 point for for every euro spent

SaleDiscountStrategy
    Get a discount of 1 euro per 100 points,
                using up to a maximum of 2000 points (20 euro)
    Points used are deducted
    Get 1 new point for for every euro spent (before discount)

SuperSaleDiscountStrategy
    Get a discount of 1 euro per 100 points,
                using up to a maximum of 4000 points (40 euro)
    Points used are deducted
    Get 2 points for for every euro spent (before discount)

In all cases, points obtained for a purchase can only be used
for a subsequent purchase.