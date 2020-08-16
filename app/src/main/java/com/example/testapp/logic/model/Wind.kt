package com.example.testapp.logic.model

fun getDirection(direction: Float): String{
    if (direction in 11.26..56.25) {
        return "东北风"
    }
    if (direction in 56.26..78.75) {
        return "东风"
    }
    if (direction in 78.76..146.25) {
        return "东南风"
    }
    if (direction in 146.26..168.75) {
        return "南风"
    }
    if (direction in 168.76..236.25) {
        return "西南风"
    }
    if (direction in 236.26..258.75) {
        return "西风"
    }
    if (direction in 281.26..348.75) {
        return "西北风"
    }
    return "北风"
}

fun getSpeed(speed: Float): String{
    if (speed in 1.0..5.0) {
        return "1级"
    }
    if (speed in 6.0..11.0) {
        return "2级"
    }
    if (speed in 12.0..19.0) {
        return "3级"
    }
    if (speed in 20.0..28.0) {
        return "4级"
    }
    if (speed in 29.0..38.0) {
        return "5级"
    }
    if (speed in 39.0..49.0) {
        return "6级"
    }
    if (speed in 50.0..61.0) {
        return "7级"
    }
    if (speed in 62.0..74.0) {
        return "8级"
    }
    if (speed in 75.0..88.0) {
        return "9级"
    }
    if (speed in 89.0..102.0) {
        return "10级"
    }
    if (speed in 103.0..117.0) {
        return "11级"
    }
    if (speed in 118.0..133.0) {
        return "12级"
    }
    if (speed in 134.0..149.0) {
        return "13级"
    }
    if (speed in 150.0..166.0) {
        return "14级"
    }
    if (speed in 167.0..183.0) {
        return "15级"
    }
    if (speed in 184.0..201.0) {
        return "16级"
    }
    if (speed in 202.0..220.0) {
        return "17级"
    }
    return "0级"
}