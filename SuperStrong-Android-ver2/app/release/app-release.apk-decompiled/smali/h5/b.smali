.class public final Lh5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg5/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lg5/f<",
        "TT;",
        "Lv4/a0;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lv4/s;

.field public static final e:Ljava/nio/charset/Charset;


# instance fields
.field public final b:Lq3/j;

.field public final c:Lq3/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq3/x<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "application/json; charset=UTF-8"

    invoke-static {v0}, Lv4/s;->a(Ljava/lang/String;)Lv4/s;

    move-result-object v0

    sput-object v0, Lh5/b;->d:Lv4/s;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lh5/b;->e:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lq3/j;Lq3/x;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq3/j;",
            "Lq3/x<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh5/b;->b:Lq3/j;

    iput-object p2, p0, Lh5/b;->c:Lq3/x;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lf5/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lf5/e;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 7
    .line 8
    new-instance v2, Lf5/d;

    .line 9
    .line 10
    invoke-direct {v2, v0}, Lf5/d;-><init>(Lf5/e;)V

    .line 11
    .line 12
    .line 13
    sget-object v3, Lh5/b;->e:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lh5/b;->b:Lq3/j;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lq3/j;->e(Ljava/io/Writer;)Lx3/c;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Lh5/b;->c:Lq3/x;

    .line 25
    .line 26
    invoke-virtual {v2, v1, p1}, Lq3/x;->b(Lx3/c;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lx3/c;->close()V

    .line 30
    .line 31
    .line 32
    new-instance p1, Lf5/h;

    .line 33
    .line 34
    :try_start_0
    iget-wide v1, v0, Lf5/e;->c:J

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lf5/e;->q(J)[B

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    invoke-direct {p1, v0}, Lf5/h;-><init>([B)V

    .line 41
    .line 42
    .line 43
    new-instance v0, Lv4/y;

    .line 44
    .line 45
    sget-object v1, Lh5/b;->d:Lv4/s;

    .line 46
    .line 47
    invoke-direct {v0, v1, p1}, Lv4/y;-><init>(Lv4/s;Lf5/h;)V

    .line 48
    .line 49
    .line 50
    return-object v0

    .line 51
    :catch_0
    move-exception p1

    .line 52
    new-instance v0, Ljava/lang/AssertionError;

    .line 53
    .line 54
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw v0
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
