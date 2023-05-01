.class public Ls4/c0;
.super Ls4/a;
.source "SourceFile"

# interfaces
.implements Ls4/b0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ls4/a<",
        "TT;>;",
        "Ls4/b0<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Le4/f;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ls4/a;-><init>(Le4/f;Z)V

    return-void
.end method


# virtual methods
.method public final n(Le4/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le4/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    :cond_0
    invoke-virtual {p0}, Ls4/z0;->D()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ls4/q0;

    .line 6
    .line 7
    if-nez v1, :cond_2

    .line 8
    .line 9
    instance-of p1, v0, Ls4/n;

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/fragment/app/r0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    check-cast v0, Ls4/n;

    .line 19
    .line 20
    iget-object p1, v0, Ls4/n;->a:Ljava/lang/Throwable;

    .line 21
    .line 22
    throw p1

    .line 23
    :cond_2
    invoke-virtual {p0, v0}, Ls4/z0;->R(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-ltz v0, :cond_0

    .line 28
    .line 29
    new-instance v0, Ls4/z0$a;

    .line 30
    .line 31
    invoke-static {p1}, Lc0/n;->g(Le4/d;)Le4/d;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {v0, p1, p0}, Ls4/z0$a;-><init>(Le4/d;Ls4/z0;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ls4/g;->o()V

    .line 39
    .line 40
    .line 41
    new-instance p1, Ls4/f1;

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ls4/f1;-><init>(Ls4/z0$a;)V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-virtual {p0, v1, v2, p1}, Ls4/z0;->k(ZZLs4/y0;)Ls4/i0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v1, Ls4/j0;

    .line 53
    .line 54
    invoke-direct {v1, p1}, Ls4/j0;-><init>(Ls4/i0;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ls4/g;->q(Lk4/l;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ls4/g;->n()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :goto_0
    return-object p1
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method
