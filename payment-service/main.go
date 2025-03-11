package main

import (
    "github.com/gin-gonic/gin"
    "github.com/prometheus/client_golang/prometheus"
    "github.com/prometheus/client_golang/prometheus/promhttp"
)

func main() {
    r := gin.Default()

    r.POST("/payments", func(c *gin.Context) {
        c.JSON(200, gin.H{
            "message": "Payment processed",
        })
    })

    // Prometheus metrics endpoint
    r.GET("/metrics", gin.WrapH(promhttp.Handler()))

    r.Run(":4000")
}