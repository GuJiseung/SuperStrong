.class public abstract Ls4/l0;
.super Ls4/t;
.source "SourceFile"


# instance fields
.field public c:J

.field public d:Z

.field public e:Lkotlinx/coroutines/internal/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/internal/a<",
            "Ls4/g0<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ls4/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final H()V
    .locals 4

    iget-wide v0, p0, Ls4/l0;->c:J

    const-wide v2, 0x100000000L

    sub-long/2addr v0, v2

    iput-wide v0, p0, Ls4/l0;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Ls4/l0;->d:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ls4/l0;->shutdown()V

    :cond_1
    return-void
.end method

.method public final I(Ls4/g0;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls4/g0<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ls4/l0;->e:Lkotlinx/coroutines/internal/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lkotlinx/coroutines/internal/a;

    .line 6
    .line 7
    invoke-direct {v0}, Lkotlinx/coroutines/internal/a;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ls4/l0;->e:Lkotlinx/coroutines/internal/a;

    .line 11
    .line 12
    :cond_0
    iget-object v1, v0, Lkotlinx/coroutines/internal/a;->a:[Ljava/lang/Object;

    .line 13
    .line 14
    iget v2, v0, Lkotlinx/coroutines/internal/a;->c:I

    .line 15
    .line 16
    aput-object p1, v1, v2

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    array-length p1, v1

    .line 21
    add-int/lit8 p1, p1, -0x1

    .line 22
    .line 23
    and-int/2addr p1, v2

    .line 24
    iput p1, v0, Lkotlinx/coroutines/internal/a;->c:I

    .line 25
    .line 26
    iget v4, v0, Lkotlinx/coroutines/internal/a;->b:I

    .line 27
    .line 28
    if-ne p1, v4, :cond_1

    .line 29
    .line 30
    array-length p1, v1

    .line 31
    shl-int/lit8 v2, p1, 0x1

    .line 32
    .line 33
    new-array v11, v2, [Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    const/16 v6, 0xa

    .line 38
    .line 39
    move-object v2, v11

    .line 40
    invoke-static/range {v1 .. v6}, Ld4/b;->r([Ljava/lang/Object;[Ljava/lang/Object;IIII)V

    .line 41
    .line 42
    .line 43
    iget-object v5, v0, Lkotlinx/coroutines/internal/a;->a:[Ljava/lang/Object;

    .line 44
    .line 45
    array-length v1, v5

    .line 46
    iget v9, v0, Lkotlinx/coroutines/internal/a;->b:I

    .line 47
    .line 48
    sub-int v7, v1, v9

    .line 49
    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v10, 0x4

    .line 52
    move-object v6, v11

    .line 53
    invoke-static/range {v5 .. v10}, Ld4/b;->r([Ljava/lang/Object;[Ljava/lang/Object;IIII)V

    .line 54
    .line 55
    .line 56
    iput-object v11, v0, Lkotlinx/coroutines/internal/a;->a:[Ljava/lang/Object;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    iput v1, v0, Lkotlinx/coroutines/internal/a;->b:I

    .line 60
    .line 61
    iput p1, v0, Lkotlinx/coroutines/internal/a;->c:I

    .line 62
    .line 63
    :cond_1
    return-void
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

.method public final J(Z)V
    .locals 4

    iget-wide v0, p0, Ls4/l0;->c:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    add-long/2addr v2, v0

    iput-wide v2, p0, Ls4/l0;->c:J

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls4/l0;->d:Z

    :cond_1
    return-void
.end method

.method public final K()Z
    .locals 7

    .line 1
    iget-object v0, p0, Ls4/l0;->e:Lkotlinx/coroutines/internal/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v2, v0, Lkotlinx/coroutines/internal/a;->b:I

    .line 8
    .line 9
    iget v3, v0, Lkotlinx/coroutines/internal/a;->c:I

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    if-ne v2, v3, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v3, v0, Lkotlinx/coroutines/internal/a;->a:[Ljava/lang/Object;

    .line 17
    .line 18
    aget-object v6, v3, v2

    .line 19
    .line 20
    aput-object v5, v3, v2

    .line 21
    .line 22
    add-int/2addr v2, v4

    .line 23
    array-length v3, v3

    .line 24
    add-int/lit8 v3, v3, -0x1

    .line 25
    .line 26
    and-int/2addr v2, v3

    .line 27
    iput v2, v0, Lkotlinx/coroutines/internal/a;->b:I

    .line 28
    .line 29
    if-eqz v6, :cond_3

    .line 30
    .line 31
    move-object v5, v6

    .line 32
    :goto_0
    check-cast v5, Ls4/g0;

    .line 33
    .line 34
    if-nez v5, :cond_2

    .line 35
    .line 36
    return v1

    .line 37
    :cond_2
    invoke-virtual {v5}, Ls4/g0;->run()V

    .line 38
    .line 39
    .line 40
    return v4

    .line 41
    :cond_3
    new-instance v0, Ljava/lang/NullPointerException;

    .line 42
    .line 43
    const-string v1, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
    .line 49
    .line 50
    .line 51
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
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public shutdown()V
    .locals 0

    return-void
.end method
