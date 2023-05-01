.class public final La5/a$c;
.super La5/a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final e:Lv4/q;

.field public f:J

.field public g:Z

.field public final synthetic h:La5/a;


# direct methods
.method public constructor <init>(La5/a;Lv4/q;)V
    .locals 2

    iput-object p1, p0, La5/a$c;->h:La5/a;

    invoke-direct {p0, p1}, La5/a$a;-><init>(La5/a;)V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, La5/a$c;->f:J

    const/4 p1, 0x1

    iput-boolean p1, p0, La5/a$c;->g:Z

    iput-object p2, p0, La5/a$c;->e:Lv4/q;

    return-void
.end method


# virtual methods
.method public final B(Lf5/e;J)J
    .locals 8

    .line 1
    iget-boolean p2, p0, La5/a$a;->c:Z

    .line 2
    .line 3
    if-nez p2, :cond_8

    .line 4
    .line 5
    iget-boolean p2, p0, La5/a$c;->g:Z

    .line 6
    .line 7
    const-wide/16 v0, -0x1

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget-wide p2, p0, La5/a$c;->f:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v4, p2, v2

    .line 17
    .line 18
    iget-object v5, p0, La5/a$c;->h:La5/a;

    .line 19
    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    cmp-long v4, p2, v0

    .line 23
    .line 24
    if-nez v4, :cond_5

    .line 25
    .line 26
    :cond_1
    const-string v4, "expected chunk size and optional extensions but was \""

    .line 27
    .line 28
    cmp-long p2, p2, v0

    .line 29
    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    iget-object p2, v5, La5/a;->c:Lf5/g;

    .line 33
    .line 34
    invoke-interface {p2}, Lf5/g;->l()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    :cond_2
    :try_start_0
    iget-object p2, v5, La5/a;->c:Lf5/g;

    .line 38
    .line 39
    invoke-interface {p2}, Lf5/g;->C()J

    .line 40
    .line 41
    .line 42
    move-result-wide p2

    .line 43
    iput-wide p2, p0, La5/a$c;->f:J

    .line 44
    .line 45
    iget-object p2, v5, La5/a;->c:Lf5/g;

    .line 46
    .line 47
    invoke-interface {p2}, Lf5/g;->l()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iget-wide v6, p0, La5/a$c;->f:J

    .line 56
    .line 57
    cmp-long p3, v6, v2

    .line 58
    .line 59
    if-ltz p3, :cond_7

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    if-nez p3, :cond_3

    .line 66
    .line 67
    const-string p3, ";"

    .line 68
    .line 69
    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result p3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    if-eqz p3, :cond_7

    .line 74
    .line 75
    :cond_3
    iget-wide p2, p0, La5/a$c;->f:J

    .line 76
    .line 77
    cmp-long p2, p2, v2

    .line 78
    .line 79
    if-nez p2, :cond_4

    .line 80
    .line 81
    const/4 p2, 0x0

    .line 82
    iput-boolean p2, p0, La5/a$c;->g:Z

    .line 83
    .line 84
    invoke-virtual {v5}, La5/a;->k()Lv4/p;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iget-object p3, v5, La5/a;->a:Lv4/u;

    .line 89
    .line 90
    iget-object p3, p3, Lv4/u;->i:Lv4/j$a;

    .line 91
    .line 92
    iget-object v2, p0, La5/a$c;->e:Lv4/q;

    .line 93
    .line 94
    invoke-static {p3, v2, p2}, Lz4/e;->d(Lv4/j;Lv4/q;Lv4/p;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, La5/a$a;->c()V

    .line 98
    .line 99
    .line 100
    :cond_4
    iget-boolean p2, p0, La5/a$c;->g:Z

    .line 101
    .line 102
    if-nez p2, :cond_5

    .line 103
    .line 104
    return-wide v0

    .line 105
    :cond_5
    iget-wide p2, p0, La5/a$c;->f:J

    .line 106
    .line 107
    const-wide/16 v2, 0x2000

    .line 108
    .line 109
    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    .line 110
    .line 111
    .line 112
    move-result-wide p2

    .line 113
    invoke-super {p0, p1, p2, p3}, La5/a$a;->B(Lf5/e;J)J

    .line 114
    .line 115
    .line 116
    move-result-wide p1

    .line 117
    cmp-long p3, p1, v0

    .line 118
    .line 119
    if-eqz p3, :cond_6

    .line 120
    .line 121
    iget-wide v0, p0, La5/a$c;->f:J

    .line 122
    .line 123
    sub-long/2addr v0, p1

    .line 124
    iput-wide v0, p0, La5/a$c;->f:J

    .line 125
    .line 126
    return-wide p1

    .line 127
    :cond_6
    iget-object p1, v5, La5/a;->b:Ly4/e;

    .line 128
    .line 129
    invoke-virtual {p1}, Ly4/e;->h()V

    .line 130
    .line 131
    .line 132
    new-instance p1, Ljava/net/ProtocolException;

    .line 133
    .line 134
    const-string p2, "unexpected end of stream"

    .line 135
    .line 136
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, La5/a$a;->c()V

    .line 140
    .line 141
    .line 142
    throw p1

    .line 143
    :cond_7
    :try_start_1
    new-instance p1, Ljava/net/ProtocolException;

    .line 144
    .line 145
    new-instance p3, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {p3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-wide v0, p0, La5/a$c;->f:J

    .line 151
    .line 152
    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string p2, "\""

    .line 159
    .line 160
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 171
    :catch_0
    move-exception p1

    .line 172
    new-instance p2, Ljava/net/ProtocolException;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p2

    .line 182
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 183
    .line 184
    const-string p2, "closed"

    .line 185
    .line 186
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p1
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
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La5/a$a;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, La5/a$c;->g:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    invoke-static {p0, v0}, Lw4/e;->h(Lf5/y;Ljava/util/concurrent/TimeUnit;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, La5/a$c;->h:La5/a;

    .line 19
    .line 20
    iget-object v0, v0, La5/a;->b:Ly4/e;

    .line 21
    .line 22
    invoke-virtual {v0}, Ly4/e;->h()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, La5/a$a;->c()V

    .line 26
    .line 27
    .line 28
    :cond_1
    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, La5/a$a;->c:Z

    .line 30
    .line 31
    return-void
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
