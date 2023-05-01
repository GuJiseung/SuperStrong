.class public final Ls4/i;
.super Ls4/w0;
.source "SourceFile"


# instance fields
.field public final f:Ls4/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls4/g<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls4/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls4/g<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ls4/w0;-><init>()V

    iput-object p1, p0, Ls4/i;->f:Ls4/g;

    return-void
.end method


# virtual methods
.method public final bridge synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Ls4/i;->m(Ljava/lang/Throwable;)V

    sget-object p1, Lc4/h;->a:Lc4/h;

    return-object p1
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ls4/y0;->n()Ls4/z0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Ls4/i;->f:Ls4/g;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ls4/g;->m(Ls4/z0;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0}, Ls4/g;->r()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, v0, Ls4/g;->e:Le4/d;

    .line 20
    .line 21
    check-cast v1, Lkotlinx/coroutines/internal/c;

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lkotlinx/coroutines/internal/c;->k(Ljava/lang/Throwable;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :goto_0
    if-eqz v1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {v0, p1}, Ls4/g;->k(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ls4/g;->r()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    iget-object p1, v0, Ls4/g;->g:Ls4/i0;

    .line 40
    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-interface {p1}, Ls4/i0;->a()V

    .line 45
    .line 46
    .line 47
    sget-object p1, Ls4/c1;->b:Ls4/c1;

    .line 48
    .line 49
    iput-object p1, v0, Ls4/g;->g:Ls4/i0;

    .line 50
    .line 51
    :cond_3
    :goto_1
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
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
