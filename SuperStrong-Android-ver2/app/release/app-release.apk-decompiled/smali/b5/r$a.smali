.class public final Lb5/r$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb5/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final b:Lf5/e;

.field public c:Z

.field public d:Z

.field public final synthetic e:Lb5/r;


# direct methods
.method public constructor <init>(Lb5/r;)V
    .locals 0

    iput-object p1, p0, Lb5/r$a;->e:Lb5/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lf5/e;

    invoke-direct {p1}, Lf5/e;-><init>()V

    iput-object p1, p0, Lb5/r$a;->b:Lf5/e;

    return-void
.end method


# virtual methods
.method public final b()Lf5/z;
    .locals 1

    iget-object v0, p0, Lb5/r$a;->e:Lb5/r;

    iget-object v0, v0, Lb5/r;->j:Lb5/r$c;

    return-object v0
.end method

.method public final c(Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Lb5/r$a;->e:Lb5/r;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lb5/r$a;->e:Lb5/r;

    .line 5
    .line 6
    iget-object v1, v1, Lb5/r;->j:Lb5/r$c;

    .line 7
    .line 8
    invoke-virtual {v1}, Lf5/c;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 9
    .line 10
    .line 11
    :goto_0
    :try_start_1
    iget-object v1, p0, Lb5/r$a;->e:Lb5/r;

    .line 12
    .line 13
    iget-wide v2, v1, Lb5/r;->b:J

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v2, v2, v4

    .line 18
    .line 19
    if-gtz v2, :cond_0

    .line 20
    .line 21
    iget-boolean v2, p0, Lb5/r$a;->d:Z

    .line 22
    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-boolean v2, p0, Lb5/r$a;->c:Z

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    iget v2, v1, Lb5/r;->k:I

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Lb5/r;->i()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    :try_start_2
    iget-object v1, v1, Lb5/r;->j:Lb5/r$c;

    .line 38
    .line 39
    invoke-virtual {v1}, Lb5/r$c;->o()V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lb5/r$a;->e:Lb5/r;

    .line 43
    .line 44
    invoke-virtual {v1}, Lb5/r;->b()V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lb5/r$a;->e:Lb5/r;

    .line 48
    .line 49
    iget-wide v1, v1, Lb5/r;->b:J

    .line 50
    .line 51
    iget-object v3, p0, Lb5/r$a;->b:Lf5/e;

    .line 52
    .line 53
    iget-wide v3, v3, Lf5/e;->c:J

    .line 54
    .line 55
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v9

    .line 59
    iget-object v1, p0, Lb5/r$a;->e:Lb5/r;

    .line 60
    .line 61
    iget-wide v2, v1, Lb5/r;->b:J

    .line 62
    .line 63
    sub-long/2addr v2, v9

    .line 64
    iput-wide v2, v1, Lb5/r;->b:J

    .line 65
    .line 66
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 67
    iget-object v0, v1, Lb5/r;->j:Lb5/r$c;

    .line 68
    .line 69
    invoke-virtual {v0}, Lf5/c;->i()V

    .line 70
    .line 71
    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    :try_start_3
    iget-object p1, p0, Lb5/r$a;->b:Lf5/e;

    .line 75
    .line 76
    iget-wide v0, p1, Lf5/e;->c:J

    .line 77
    .line 78
    cmp-long p1, v9, v0

    .line 79
    .line 80
    if-nez p1, :cond_1

    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    goto :goto_2

    .line 86
    :cond_1
    const/4 p1, 0x0

    .line 87
    :goto_1
    move v7, p1

    .line 88
    iget-object p1, p0, Lb5/r$a;->e:Lb5/r;

    .line 89
    .line 90
    iget-object v5, p1, Lb5/r;->d:Lb5/g;

    .line 91
    .line 92
    iget v6, p1, Lb5/r;->c:I

    .line 93
    .line 94
    iget-object v8, p0, Lb5/r$a;->b:Lf5/e;

    .line 95
    .line 96
    invoke-virtual/range {v5 .. v10}, Lb5/g;->p(IZLf5/e;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lb5/r$a;->e:Lb5/r;

    .line 100
    .line 101
    iget-object p1, p1, Lb5/r;->j:Lb5/r$c;

    .line 102
    .line 103
    invoke-virtual {p1}, Lb5/r$c;->o()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :goto_2
    iget-object v0, p0, Lb5/r$a;->e:Lb5/r;

    .line 108
    .line 109
    iget-object v0, v0, Lb5/r;->j:Lb5/r$c;

    .line 110
    .line 111
    invoke-virtual {v0}, Lb5/r$c;->o()V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :catchall_1
    move-exception p1

    .line 116
    :try_start_4
    iget-object v1, p0, Lb5/r$a;->e:Lb5/r;

    .line 117
    .line 118
    iget-object v1, v1, Lb5/r;->j:Lb5/r$c;

    .line 119
    .line 120
    invoke-virtual {v1}, Lb5/r$c;->o()V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :catchall_2
    move-exception p1

    .line 125
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 126
    throw p1
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

.method public final close()V
    .locals 13

    .line 1
    iget-object v0, p0, Lb5/r$a;->e:Lb5/r;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lb5/r$a;->c:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    iget-object v0, p0, Lb5/r$a;->e:Lb5/r;

    .line 12
    .line 13
    iget-object v1, v0, Lb5/r;->h:Lb5/r$a;

    .line 14
    .line 15
    iget-boolean v1, v1, Lb5/r$a;->d:Z

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v1, :cond_3

    .line 19
    .line 20
    iget-object v1, p0, Lb5/r$a;->b:Lf5/e;

    .line 21
    .line 22
    iget-wide v3, v1, Lf5/e;->c:J

    .line 23
    .line 24
    const-wide/16 v5, 0x0

    .line 25
    .line 26
    cmp-long v1, v3, v5

    .line 27
    .line 28
    if-lez v1, :cond_1

    .line 29
    .line 30
    move v1, v2

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    :goto_0
    if-eqz v1, :cond_2

    .line 34
    .line 35
    :goto_1
    iget-object v0, p0, Lb5/r$a;->b:Lf5/e;

    .line 36
    .line 37
    iget-wide v0, v0, Lf5/e;->c:J

    .line 38
    .line 39
    cmp-long v0, v0, v5

    .line 40
    .line 41
    if-lez v0, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Lb5/r$a;->c(Z)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object v7, v0, Lb5/r;->d:Lb5/g;

    .line 48
    .line 49
    iget v8, v0, Lb5/r;->c:I

    .line 50
    .line 51
    const/4 v9, 0x1

    .line 52
    const/4 v10, 0x0

    .line 53
    const-wide/16 v11, 0x0

    .line 54
    .line 55
    invoke-virtual/range {v7 .. v12}, Lb5/g;->p(IZLf5/e;J)V

    .line 56
    .line 57
    .line 58
    :cond_3
    iget-object v1, p0, Lb5/r$a;->e:Lb5/r;

    .line 59
    .line 60
    monitor-enter v1

    .line 61
    :try_start_1
    iput-boolean v2, p0, Lb5/r$a;->c:Z

    .line 62
    .line 63
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    iget-object v0, p0, Lb5/r$a;->e:Lb5/r;

    .line 65
    .line 66
    iget-object v0, v0, Lb5/r;->d:Lb5/g;

    .line 67
    .line 68
    invoke-virtual {v0}, Lb5/g;->flush()V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lb5/r$a;->e:Lb5/r;

    .line 72
    .line 73
    invoke-virtual {v0}, Lb5/r;->a()V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    throw v0

    .line 80
    :catchall_1
    move-exception v1

    .line 81
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 82
    throw v1
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

.method public final flush()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/r$a;->e:Lb5/r;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lb5/r$a;->e:Lb5/r;

    .line 5
    .line 6
    invoke-virtual {v1}, Lb5/r;->b()V

    .line 7
    .line 8
    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :goto_0
    iget-object v0, p0, Lb5/r$a;->b:Lf5/e;

    .line 11
    .line 12
    iget-wide v0, v0, Lf5/e;->c:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Lb5/r$a;->c(Z)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lb5/r$a;->e:Lb5/r;

    .line 25
    .line 26
    iget-object v0, v0, Lb5/r;->d:Lb5/g;

    .line 27
    .line 28
    invoke-virtual {v0}, Lb5/g;->flush()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw v1
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

.method public final u(Lf5/e;J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/r$a;->b:Lf5/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lf5/e;->u(Lf5/e;J)V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget-wide p1, v0, Lf5/e;->c:J

    .line 7
    .line 8
    const-wide/16 v1, 0x4000

    .line 9
    .line 10
    cmp-long p1, p1, v1

    .line 11
    .line 12
    if-ltz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Lb5/r$a;->c(Z)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
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
