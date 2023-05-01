.class public Ls4/x0;
.super Ls4/z0;
.source "SourceFile"


# instance fields
.field public final c:Z


# direct methods
.method public constructor <init>(Ls4/u0;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Ls4/z0;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ls4/z0;->I(Ls4/u0;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ls4/z0;->C()Ls4/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    instance-of v1, p1, Ls4/k;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast p1, Ls4/k;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object p1, v2

    .line 21
    :goto_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    move-object p1, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-virtual {p1}, Ls4/y0;->n()Ls4/z0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_1
    if-nez p1, :cond_2

    .line 30
    .line 31
    goto :goto_4

    .line 32
    :cond_2
    invoke-virtual {p1}, Ls4/z0;->z()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    goto :goto_5

    .line 39
    :cond_3
    invoke-virtual {p1}, Ls4/z0;->C()Ls4/j;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    instance-of v1, p1, Ls4/k;

    .line 44
    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    check-cast p1, Ls4/k;

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    move-object p1, v2

    .line 51
    :goto_2
    if-nez p1, :cond_5

    .line 52
    .line 53
    move-object p1, v2

    .line 54
    goto :goto_3

    .line 55
    :cond_5
    invoke-virtual {p1}, Ls4/y0;->n()Ls4/z0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_3
    if-nez p1, :cond_2

    .line 60
    .line 61
    :goto_4
    const/4 v0, 0x0

    .line 62
    :goto_5
    iput-boolean v0, p0, Ls4/x0;->c:Z

    .line 63
    .line 64
    return-void
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


# virtual methods
.method public final A()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final z()Z
    .locals 1

    iget-boolean v0, p0, Ls4/x0;->c:Z

    return v0
.end method
