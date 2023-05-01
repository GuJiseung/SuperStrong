.class public final Lf5/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/f;


# instance fields
.field public final b:Lf5/e;

.field public final c:Lf5/x;

.field public d:Z


# direct methods
.method public constructor <init>(Lf5/x;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf5/e;

    invoke-direct {v0}, Lf5/e;-><init>()V

    iput-object v0, p0, Lf5/s;->b:Lf5/e;

    iput-object p1, p0, Lf5/s;->c:Lf5/x;

    return-void
.end method


# virtual methods
.method public final A(J)Lf5/f;
    .locals 1

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0, p1, p2}, Lf5/e;->H(J)Lf5/e;

    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a()Lf5/e;
    .locals 1

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    return-object v0
.end method

.method public final b()Lf5/z;
    .locals 1

    iget-object v0, p0, Lf5/s;->c:Lf5/x;

    invoke-interface {v0}, Lf5/x;->b()Lf5/z;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lf5/f;
    .locals 5

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0}, Lf5/e;->f()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-lez v3, :cond_0

    iget-object v3, p0, Lf5/s;->c:Lf5/x;

    invoke-interface {v3, v0, v1, v2}, Lf5/x;->u(Lf5/e;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 6

    .line 1
    iget-object v0, p0, Lf5/s;->c:Lf5/x;

    .line 2
    .line 3
    iget-boolean v1, p0, Lf5/s;->d:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    iget-object v1, p0, Lf5/s;->b:Lf5/e;

    .line 9
    .line 10
    iget-wide v2, v1, Lf5/e;->c:J

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v4, v2, v4

    .line 15
    .line 16
    if-lez v4, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, v1, v2, v3}, Lf5/x;->u(Lf5/e;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    :cond_1
    const/4 v1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    :goto_0
    :try_start_1
    invoke-interface {v0}, Lf5/x;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    move-object v1, v0

    .line 32
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lf5/s;->d:Z

    .line 34
    .line 35
    if-nez v1, :cond_3

    .line 36
    .line 37
    return-void

    .line 38
    :cond_3
    sget-object v0, Lf5/a0;->a:Ljava/nio/charset/Charset;

    .line 39
    .line 40
    throw v1
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
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

.method public final d(J)Lf5/f;
    .locals 1

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0, p1, p2}, Lf5/e;->I(J)Lf5/e;

    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final flush()V
    .locals 5

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    iget-wide v1, v0, Lf5/e;->c:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    iget-object v4, p0, Lf5/s;->c:Lf5/x;

    if-lez v3, :cond_0

    invoke-interface {v4, v0, v1, v2}, Lf5/x;->u(Lf5/e;J)V

    :cond_0
    invoke-interface {v4}, Lf5/x;->flush()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(Lf5/h;)Lf5/f;
    .locals 1

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0, p1}, Lf5/e;->F(Lf5/h;)V

    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lf5/s;->d:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "buffer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lf5/s;->c:Lf5/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lf5/e;J)V
    .locals 1

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0, p1, p2, p3}, Lf5/e;->u(Lf5/e;J)V

    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0, p1}, Lf5/e;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([B)Lf5/f;
    .locals 3

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    .line 1
    array-length v2, p1

    invoke-virtual {v0, p1, v1, v2}, Lf5/e;->write([BII)V

    .line 2
    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    return-object p0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([BII)Lf5/f;
    .locals 1

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0, p1, p2, p3}, Lf5/e;->write([BII)V

    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final writeByte(I)Lf5/f;
    .locals 1

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0, p1}, Lf5/e;->G(I)V

    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final writeInt(I)Lf5/f;
    .locals 1

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0, p1}, Lf5/e;->J(I)V

    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final writeShort(I)Lf5/f;
    .locals 1

    iget-boolean v0, p0, Lf5/s;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    invoke-virtual {v0, p1}, Lf5/e;->K(I)V

    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final z(Ljava/lang/String;)Lf5/f;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lf5/s;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lf5/s;->b:Lf5/e;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v0, v2, v1, p1}, Lf5/e;->L(IILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lf5/s;->c()Lf5/f;

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "closed"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
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
.end method
